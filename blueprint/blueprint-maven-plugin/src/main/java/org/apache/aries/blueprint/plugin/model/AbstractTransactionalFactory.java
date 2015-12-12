package org.apache.aries.blueprint.plugin.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract factory for creating {@link TransactionalDef} for a given class.
 *
 * @param <A> the transactional annotation type.
 */
public abstract class AbstractTransactionalFactory<A extends Annotation>
{
    /**
     * Create {@link TransactionalDef} objects for the given class, inspecting
     * class and methods for transaction annotations.
     *
     * @param clazz the class to inspect.
     * @return a set of {@link TransactionalDef} objects.
     */
    public Set<TransactionalDef> create(Class<?> clazz) {
        Set<TransactionalDef> transactionalDefs = new HashSet<TransactionalDef>();
        A transactional = clazz.getAnnotation(getTransactionalClass());
        if (transactional != null) {
            transactionalDefs.add(new TransactionalDef("*", getTransactionTypeName(transactional)));
        }
        for (Method method : clazz.getMethods()) {
            transactional = method.getAnnotation(getTransactionalClass());
            if (transactional != null) {
                transactionalDefs.add(new TransactionalDef(method.getName(), getTransactionTypeName(transactional)));
            }
        }
        return transactionalDefs;
    }

    /**
     * @param transactional the transactional annotation.
     * @return the blueprint-compatible name of the transaction type.
     */
    public abstract String getTransactionTypeName(A transactional);

    /**
     * @return the annotation class to search for.
     */
    public abstract Class<A> getTransactionalClass();
}
