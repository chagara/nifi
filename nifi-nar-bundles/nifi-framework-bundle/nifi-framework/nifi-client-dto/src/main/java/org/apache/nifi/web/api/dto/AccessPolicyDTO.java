/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto;

import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.nifi.web.api.entity.UserEntity;
import org.apache.nifi.web.api.entity.UserGroupEntity;

import javax.xml.bind.annotation.XmlType;
import java.util.Set;

/**
 * Details for the access configuration.
 */
@XmlType(name = "accessPolicy")
public class AccessPolicyDTO  extends ComponentDTO {

    private String resource;
    private Set<UserEntity> users;
    private Set<UserGroupEntity> userGroups;
    private Boolean canRead;
    private Boolean canWrite;

    /**
     * @return Indicates whether the user can read a given resource.
     */
    @ApiModelProperty(
            value = "Indicates whether the user can read a given resource.",
            readOnly = true
    )
    public Boolean getCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    /**
     * @return Indicates whether the user can write a given resource.
     */
    @ApiModelProperty(
            value = "Indicates whether the user can write a given resource.",
            readOnly = true
    )
    public Boolean getCanWrite() {
        return canWrite;
    }

    public void setCanWrite(Boolean canWrite) {
        this.canWrite = canWrite;
    }

    /**
     * @return The resource ID for this access policy.
     */
    @ApiModelProperty(value="The resource ID for this access policy.")
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * @return The set of user IDs associated with this access policy.
     */
    @ApiModelProperty(value = "The set of user IDs associated with this access policy.")
    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

    /**
     * @return The set of user group IDs associated with this access policy.
     */
    @ApiModelProperty(value = "The set of user group IDs associated with this access policy.")
    public Set<UserGroupEntity> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Set<UserGroupEntity> userGroups) {
        this.userGroups = userGroups;
    }
}
