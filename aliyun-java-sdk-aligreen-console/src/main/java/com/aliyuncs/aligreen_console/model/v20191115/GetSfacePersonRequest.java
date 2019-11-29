/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aligreen_console.model.v20191115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aligreen_console.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSfacePersonRequest extends RpcAcsRequest<GetSfacePersonResponse> {
	   

	private String personId;
	public GetSfacePersonRequest() {
		super("aligreen-console", "2019-11-15", "GetSfacePerson");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
		if(personId != null){
			putQueryParameter("PersonId", personId);
		}
	}

	@Override
	public Class<GetSfacePersonResponse> getResponseClass() {
		return GetSfacePersonResponse.class;
	}

}