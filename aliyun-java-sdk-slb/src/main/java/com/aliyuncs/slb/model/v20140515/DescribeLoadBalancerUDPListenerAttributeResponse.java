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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerUDPListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerUDPListenerAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer listenerPort;

	private Integer backendServerPort;

	private String status;

	private Integer bandwidth;

	private String scheduler;

	private Integer persistenceTimeout;

	private String healthCheck;

	private Integer healthyThreshold;

	private Integer unhealthyThreshold;

	private Integer healthCheckConnectTimeout;

	private Integer healthCheckConnectPort;

	private Integer healthCheckInterval;

	private String healthCheckReq;

	private String healthCheckExp;

	private Integer maxConnection;

	private String vServerGroupId;

	private String masterSlaveServerGroupId;

	private String aclId;

	private String aclType;

	private String aclStatus;

	private String vpcIds;

	private String description;

	private String connectionDrain;

	private Integer connectionDrainTimeout;

	private List<PortRange> portRanges;

	private List<String> aclIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
	}

	public String getHealthCheckReq() {
		return this.healthCheckReq;
	}

	public void setHealthCheckReq(String healthCheckReq) {
		this.healthCheckReq = healthCheckReq;
	}

	public String getHealthCheckExp() {
		return this.healthCheckExp;
	}

	public void setHealthCheckExp(String healthCheckExp) {
		this.healthCheckExp = healthCheckExp;
	}

	public Integer getMaxConnection() {
		return this.maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getMasterSlaveServerGroupId() {
		return this.masterSlaveServerGroupId;
	}

	public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
		this.masterSlaveServerGroupId = masterSlaveServerGroupId;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public String getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(String vpcIds) {
		this.vpcIds = vpcIds;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConnectionDrain() {
		return this.connectionDrain;
	}

	public void setConnectionDrain(String connectionDrain) {
		this.connectionDrain = connectionDrain;
	}

	public Integer getConnectionDrainTimeout() {
		return this.connectionDrainTimeout;
	}

	public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
		this.connectionDrainTimeout = connectionDrainTimeout;
	}

	public List<PortRange> getPortRanges() {
		return this.portRanges;
	}

	public void setPortRanges(List<PortRange> portRanges) {
		this.portRanges = portRanges;
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;
	}

	public static class PortRange {

		private Integer startPort;

		private Integer endPort;

		public Integer getStartPort() {
			return this.startPort;
		}

		public void setStartPort(Integer startPort) {
			this.startPort = startPort;
		}

		public Integer getEndPort() {
			return this.endPort;
		}

		public void setEndPort(Integer endPort) {
			this.endPort = endPort;
		}
	}

	@Override
	public DescribeLoadBalancerUDPListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerUDPListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
