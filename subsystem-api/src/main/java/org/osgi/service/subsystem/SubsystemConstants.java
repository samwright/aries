/*
 * Copyright (c) OSGi Alliance (2011). All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.osgi.service.subsystem;

import org.osgi.framework.resource.ResourceConstants;

/**
 * Defines the constants used by subsystems.
 */
public class SubsystemConstants {
	/**
	 * Manifest header identifying the resources to be deployed.
	 */
	public static final String DEPLOYED_CONTENT = "Deployed-Content";

	/**
	 * Manifest header attribute identifying the deployed version.
	 */
	public static final String DEPLOYED_VERSION_ATTRIBUTE = "deployed-version";

	/**
	 * An identity {@link ResourceConstants#IDENTITY_TYPE_ATTRIBUTE type} 
	 * attribute value identifying a subsystem resource type.
	 * It is defined to be &quot;osgi.subsystem.&quot;.
	 */
	public static final String IDENTITY_TYPE_SUBSYSTEM = "osgi.subsystem";
	
	/**
	 * Manifest header used to express a preference for particular resources to
	 * satisfy implicit package dependencies.
	 */
	public static final String PREFERRED_PROVIDER = "Preferred-Provider";
	
	/**
	 * A value for the {@link #PROVISION_POLICY_DIRECTIVE provision-policy}
	 * directive indicating the subsystem accepts transitive resources. The root
	 * subsystem has this provision policy.
	 */
	public static final String PROVISION_POLICY_ACCEPT_TRANSITIVE = "acceptTransitive";
	
	/**
	 * Manifest header directive identifying the provision policy. The default 
	 * value is {@link #PROVISION_POLICY_REJECT_TRANSITIVE rejectTransitive}.
	 */
	public static final String PROVISION_POLICY_DIRECTIVE = "provision-policy";
	
	/**
	 * A value for the {@link #PROVISION_POLICY_DIRECTIVE provision-policy}
	 * directive indicating the subsystem does not accept transitive resources.
	 * This is the default value.
	 */
	public static final String PROVISION_POLICY_REJECT_TRANSITIVE = "rejectTransitive";

	/**
	 * Manifest header identifying the resources to be deployed to satisfy the 
	 * transitive dependencies of a subsystem.
	 */
	public static final String PROVISION_RESOURCE = "Provision-Resource";

	/**
	 * Manifest header directive identifying the start level.
	 */
	public static final String START_LEVEL_DIRECTIVE = "start-level";
	
	/**
	 * The list of subsystem contents identified by a symbolic name and version.
	 */
	public static final String SUBSYSTEM_CONTENT = "Subsystem-Content";
	
	/**
	 * Human readable description.
	 */
	public static final String SUBSYSTEM_DESCRIPTION = "Subsystem-Description";
	
	/**
	 * Manifest header identifying services offered for export.
	 */
	public static final String SUBSYSTEM_EXPORTSERVICE = "Subsystem-ExportService";
	
	/**
	 * The name of the service property for the {@link 
	 * Subsystem#getSubsystemId() subsystem ID}.
	 * It is defined to be &quot;subsystem.id&quot;.
	 */
	public static final String SUBSYSTEM_ID_PROPERTY = "subsystem.id";
	
	/**
	 * Manifest header identifying services required for import.
	 */
	public static final String SUBSYSTEM_IMPORTSERVICE = "Subsystem-ImportService";
	
	/**
	 * The subsystem manifest version header must be present and equals to 1.0 
	 * for this version of applications. 
	 */
	public static final String SUBSYSTEM_MANIFESTVERSION = "Subsystem-ManifestVersion";
	
	/**
	 * Human readable subsystem name.
	 */
	public static final String SUBSYSTEM_NAME = "Subsystem-Name";
	
	/**
	 * The name of the service property for the subsystem {@link 
	 * Subsystem#getState() state}.
	 * It is defined to be &quot;subsystem.state&quot;.
	 */
	public static final String SUBSYSTEM_STATE_PROPERTY = "subsystem.state";
	
	/**
	 * Symbolic name for the application. Must be present.
	 */
	public static final String SUBSYSTEM_SYMBOLICNAME = "Subsystem-SymbolicName";
	
	/**
	 * The name of the service property for the subsystem {@link 
	 * Subsystem#getSymbolicName() symbolic name}.
	 * It is defined to be &quot;subsystem.symbolicname&quot;.
	 */
	public static final String SUBSYSTEM_SYMBOLICNAME_PROPERTY = "subsystem.symbolicname";
	
	/**
	 * Manifest header identifying the subsystem type.
	 */
	public static final String SUBSYSTEM_TYPE = "Subsystem-Type";
	
	/**
	 * The name of the service property for the subsystem {@link #SUBSYSTEM_TYPE
	 * type}.
	 * It is defined to be &quot;subsystem.type&quot;.
	 */
	public static final String SUBSYSTEM_TYPE_PROPERTY = "subsystem.type";
	
	/**
	 * Manifest header value identifying an application subsystem.
	 * It is defined to be &quot;osgi.application&quot;.
	 */
	public static final String SUBSYSTEM_TYPE_APPLICATION = "osgi.application";
	
	/**
	 * Manifest header value identifying a composite subsystem.
	 * It is defined to be &quot;osgi.composite&quot;.
	 */
	public static final String SUBSYSTEM_TYPE_COMPOSITE = "osgi.composite";
	
	/**
	 * Manifest header value identifying a feature subsystem.
	 * It is defined to be &quot;osgi.feature&quot;.
	 */
	public static final String SUBSYSTEM_TYPE_FEATURE = "osgi.feature";
	
	/**
	 * Version of the application. If not present, the default value is 0.0.0.
	 */
	public static final String SUBSYSTEM_VERSION = "Subsystem-Version";
	
	/**
	 * The name of the service property for the subsystem {@link 
	 * Subsystem#getVersion() version}.
	 */
	public static final String SUBSYSTEM_VERSION_PROPERTY = "subsystem.version";
}