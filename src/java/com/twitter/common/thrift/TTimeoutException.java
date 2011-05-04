// =================================================================================================
// Copyright 2011 Twitter, Inc.
// -------------------------------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this work except in compliance with the License.
// You may obtain a copy of the License in the LICENSE file, or at:
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// =================================================================================================

package com.twitter.common.thrift;

import org.apache.thrift.TException;

/**
 * @author Adam Samet
 *
 * This is exception is thrown when accessing a thrift service resource times out.
 */
public class TTimeoutException extends TException {

  private static final long serialVersionUID = 1L;

  public TTimeoutException(String message) {
    super(message);
  }

  public TTimeoutException(Throwable cause) {
    super(cause);
  }

  public TTimeoutException(String message, Throwable cause) {
    super(message, cause);
  }
}
