/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The Get Network Configuration operation response.
*/
public class NetworkGetConfigurationResponse extends OperationResponse {
    private String configuration;
    
    /**
    * Required. The network configuration for this subscription.
    * @return The Configuration value.
    */
    public String getConfiguration() {
        return this.configuration;
    }
    
    /**
    * Required. The network configuration for this subscription.
    * @param configurationValue The Configuration value.
    */
    public void setConfiguration(final String configurationValue) {
        this.configuration = configurationValue;
    }
    
    /**
    * Initializes a new instance of the NetworkGetConfigurationResponse class.
    *
    */
    public NetworkGetConfigurationResponse() {
        super();
    }
    
    /**
    * Initializes a new instance of the NetworkGetConfigurationResponse class
    * with required arguments.
    *
    */
    public NetworkGetConfigurationResponse(String configuration) {
        if (configuration == null) {
            throw new NullPointerException("configuration");
        }
        this.setConfiguration(configuration);
    }
}
