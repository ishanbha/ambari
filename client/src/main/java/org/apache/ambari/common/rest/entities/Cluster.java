/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.common.rest.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for ClusterType complex type.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cluster", propOrder = {
    "name",
    "ID",
    "revision",
    "clusterDefinition",
    "clusterState"
})
@XmlRootElement(name = "Cluster")
public class Cluster {
        
    protected String ID;
    protected long revision;
        
        @XmlElement(name = "ClusterDefinition", required = true)
        protected ClusterDefinition clusterDefinition;
        @XmlElement(name = "ClusterState", required = true)
        protected ClusterState clusterState;
        
        /**
         * @return the revision
         */
        public long getRevision() {
                return revision;
        }
        /**
         * @param revision the revision to set
         */
        public void setRevision(long revision) {
                this.revision = revision;
        }
        
        /**
         * @return the iD
         */
        public String getID() {
                return ID;
        }
        /**
         * @param iD the iD to set
         */
        public void setID(String iD) {
                ID = iD;
        }
        
        /**
         * @return the clusterDefinition
         */
        public ClusterDefinition getClusterDefinition() {
                return clusterDefinition;
        }
        /**
         * @param clusterDefinition the clusterDefinition to set
         */
        public void setClusterDefinition(ClusterDefinition clusterDefinition) {
                this.clusterDefinition = clusterDefinition;
        }
        /**
         * @return the clusterState
         */
        public ClusterState getClusterState() {
                return clusterState;
        }
        /**
         * @param clusterState the clusterState to set
         */
        public void setClusterState(ClusterState clusterState) {
                this.clusterState = clusterState;
        }
        
}
