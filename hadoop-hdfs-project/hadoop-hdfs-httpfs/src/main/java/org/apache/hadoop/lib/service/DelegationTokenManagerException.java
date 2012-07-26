/**
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
package org.apache.hadoop.lib.service;

import org.apache.hadoop.lib.lang.XException;

/**
 * Exception thrown by the {@link DelegationTokenManager} service implementation.
 */
public class DelegationTokenManagerException extends XException {

  public enum ERROR implements XException.ERROR {
    DT01("Could not verify delegation token, {0}"),
    DT02("Could not renew delegation token, {0}"),
    DT03("Could not cancel delegation token, {0}"),
    DT04("Could not create delegation token, {0}");

    private String template;

    ERROR(String template) {
      this.template = template;
    }

    @Override
    public String getTemplate() {
      return template;
    }
  }

  public DelegationTokenManagerException(ERROR error, Object... params) {
    super(error, params);
  }

}
