/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.geronimo.blueprint.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/**
 * TODO: javadoc
 *
 * @author <a href="mailto:dev@geronimo.apache.org">Apache Geronimo Project</a>
 * @version $Rev$, $Date$
 */
public class ArgumentsMatch {

    private Method method;
    private Constructor constructor;
    private List<Object> arguments;

    public ArgumentsMatch(Constructor constructor, List<Object> arguments) {
        this.constructor = constructor;
        this.arguments = arguments;
    }

    public ArgumentsMatch(Method method, List<Object> arguments) {
        this.method = method;
        this.arguments = arguments;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public Method getMethod() {
        return method;
    }

    public Class[] getParameterTypes() {
        if (constructor != null) {
            return constructor.getParameterTypes();
        } else if (method != null) {
            return method.getParameterTypes();
        } else {
            return null;
        }
    }
    
    public Type[] getGenericParameterTypes() {
        if (constructor != null) {
            return constructor.getGenericParameterTypes();
        } else if (method != null) {
            return method.getGenericParameterTypes();
        } else {
            return null;
        }
    }
    
    public List<Object> getArguments() {
        return arguments;
    }

    public String toString() {
        return method + " " + constructor + " " + arguments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArgumentsMatch)) return false;

        ArgumentsMatch that = (ArgumentsMatch) o;

        if (constructor != null ? !constructor.equals(that.constructor) : that.constructor != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = method != null ? method.hashCode() : 0;
        result = 31 * result + (constructor != null ? constructor.hashCode() : 0);
        result = 31 * result + (arguments != null ? arguments.hashCode() : 0);
        return result;
    }
}


