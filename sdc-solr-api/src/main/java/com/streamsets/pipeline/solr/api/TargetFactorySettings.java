/**
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.solr.api;

public class TargetFactorySettings {
  private String instanceType;
  private String solrURI;
  private String zookeeperConnect;
  private String defaultCollection;
  private boolean kerberosAuth;

  public TargetFactorySettings (
      String instanceType,
      String solrURI,
      String zookeeperConnect,
      String defaultCollection,
      boolean kerberosAuth
  ) {
    this.instanceType = instanceType;
    this.solrURI = solrURI;
    this.zookeeperConnect = zookeeperConnect;
    this.defaultCollection = defaultCollection;
    this.kerberosAuth = kerberosAuth;
  }

  public String getInstanceType() {
    return instanceType;
  }

  public String getSolrURI() {
    return solrURI;
  }

  public String getZookeeperConnect() {
    return zookeeperConnect;
  }

  public String getDefaultCollection() {
    return defaultCollection;
  }

  public boolean getKerberosAuth() {
    return kerberosAuth;
  }
}
