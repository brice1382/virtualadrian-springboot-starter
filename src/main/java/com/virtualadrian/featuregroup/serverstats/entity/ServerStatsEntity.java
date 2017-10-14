package com.virtualadrian.featuregroup.serverstats.entity;


import com.virtualadrian.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="server_stats")
public class ServerStatsEntity extends BaseEntity {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="user_name")
  private String userName;

  @Column(name="server_hash")
  private String serverHash;

  @Column(name="uptime")
  private String uptime;

  @Column(name="sessions")
  private String sessions;

  @Column(name="processes")
  private String processes;

  @Column(name="processes_array")
  private String processesArray;

  @Column(name="file_handles")
  private String fileHandles;

  @Column(name="file_handles_limit")
  private String fileHandlesLimit;

  @Column(name="os_kernel")
  private String osKernel;

  @Column(name="os_name")
  private String osName;

  @Column(name="os_arch")
  private String osArch;

  @Column(name="cpu_name")
  private String cpuName;

  @Column(name="cpu_cores")
  private String cpuCores;

  @Column(name="cpu_freq")
  private String cpuFreq;

  @Column(name="ram_total")
  private String ramTotal;

  @Column(name="ram_usage")
  private String ramUsage;

  @Column(name="swap_total")
  private String swapTotal;

  @Column(name="swap_usage")
  private String swapUsage;

  @Column(name="disk_array")
  private String diskArray;

  @Column(name="disk_total")
  private String diskTotal;

  @Column(name="disk_usage")
  private String diskUsage;

  @Column(name="connections")
  private String connections;

  @Column(name="nic")
  private String nic;

  @Column(name="ipv4")
  private String ipv4;

  @Column(name="ipv6")
  private String ipv6;

  @Column(name="rx")
  private String rx;

  @Column(name="tx")
  private String tx;

  @Column(name="rx_gap")
  private String rxGap;

  @Column(name="tx_gap")
  private String txGap;

  @Column(name="load")
  private String load;

  @Column(name="load_cpu")
  private String loadCpu;

  @Column(name="load_io")
  private String loadIo;

  @Column(name="ping_eu")
  private String pingEu;

  @Column(name="ping_us")
  private String pingUs;

  @Column(name="ping_as")
  private String pingAs;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getServerHash() {
    return this.serverHash;
  }

  public void setServerHash(String serverHash) {
    this.serverHash = serverHash;
  }

  public String getUptime() {
    return this.uptime;
  }

  public void setUptime(String uptime) {
    this.uptime = uptime;
  }

  public String getSessions() {
    return this.sessions;
  }

  public void setSessions(String sessions) {
    this.sessions = sessions;
  }

  public String getProcesses() {
    return this.processes;
  }

  public void setProcesses(String processes) {
    this.processes = processes;
  }

  public String getProcessesArray() {
    return this.processesArray;
  }

  public void setProcessesArray(String processesArray) {
    this.processesArray = processesArray;
  }

  public String getFileHandles() {
    return this.fileHandles;
  }

  public void setFileHandles(String fileHandles) {
    this.fileHandles = fileHandles;
  }

  public String getFileHandlesLimit() {
    return this.fileHandlesLimit;
  }

  public void setFileHandlesLimit(String fileHandlesLimit) {
    this.fileHandlesLimit = fileHandlesLimit;
  }

  public String getOsKernel() {
    return this.osKernel;
  }

  public void setOsKernel(String osKernel) {
    this.osKernel = osKernel;
  }

  public String getOsName() {
    return this.osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public String getOsArch() {
    return this.osArch;
  }

  public void setOsArch(String osArch) {
    this.osArch = osArch;
  }

  public String getCpuName() {
    return this.cpuName;
  }

  public void setCpuName(String cpuName) {
    this.cpuName = cpuName;
  }

  public String getCpuCores() {
    return this.cpuCores;
  }

  public void setCpuCores(String cpuCores) {
    this.cpuCores = cpuCores;
  }

  public String getCpuFreq() {
    return this.cpuFreq;
  }

  public void setCpuFreq(String cpuFreq) {
    this.cpuFreq = cpuFreq;
  }

  public String getRamTotal() {
    return this.ramTotal;
  }

  public void setRamTotal(String ramTotal) {
    this.ramTotal = ramTotal;
  }

  public String getRamUsage() {
    return this.ramUsage;
  }

  public void setRamUsage(String ramUsage) {
    this.ramUsage = ramUsage;
  }

  public String getSwapTotal() {
    return this.swapTotal;
  }

  public void setSwapTotal(String swapTotal) {
    this.swapTotal = swapTotal;
  }

  public String getSwapUsage() {
    return this.swapUsage;
  }

  public void setSwapUsage(String swapUsage) {
    this.swapUsage = swapUsage;
  }

  public String getDiskArray() {
    return this.diskArray;
  }

  public void setDiskArray(String diskArray) {
    this.diskArray = diskArray;
  }

  public String getDiskTotal() {
    return this.diskTotal;
  }

  public void setDiskTotal(String diskTotal) {
    this.diskTotal = diskTotal;
  }

  public String getDiskUsage() {
    return this.diskUsage;
  }

  public void setDiskUsage(String diskUsage) {
    this.diskUsage = diskUsage;
  }

  public String getConnections() {
    return this.connections;
  }

  public void setConnections(String connections) {
    this.connections = connections;
  }

  public String getNic() {
    return this.nic;
  }

  public void setNic(String nic) {
    this.nic = nic;
  }

  public String getIpv4() {
    return this.ipv4;
  }

  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }

  public String getIpv6() {
    return this.ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }

  public String getRx() {
    return this.rx;
  }

  public void setRx(String rx) {
    this.rx = rx;
  }

  public String getTx() {
    return this.tx;
  }

  public void setTx(String tx) {
    this.tx = tx;
  }

  public String getRxGap() {
    return this.rxGap;
  }

  public void setRxGap(String rxGap) {
    this.rxGap = rxGap;
  }

  public String getTxGap() {
    return this.txGap;
  }

  public void setTxGap(String txGap) {
    this.txGap = txGap;
  }

  public String getLoad() {
    return this.load;
  }

  public void setLoad(String load) {
    this.load = load;
  }

  public String getLoadCpu() {
    return this.loadCpu;
  }

  public void setLoadCpu(String loadCpu) {
    this.loadCpu = loadCpu;
  }

  public String getLoadIo() {
    return this.loadIo;
  }

  public void setLoadIo(String loadIo) {
    this.loadIo = loadIo;
  }

  public String getPingEu() {
    return this.pingEu;
  }

  public void setPingEu(String pingEu) {
    this.pingEu = pingEu;
  }

  public String getPingUs() {
    return this.pingUs;
  }

  public void setPingUs(String pingUs) {
    this.pingUs = pingUs;
  }

  public String getPingAs() {
    return this.pingAs;
  }

  public void setPingAs(String pingAs) {
    this.pingAs = pingAs;
  }
}
