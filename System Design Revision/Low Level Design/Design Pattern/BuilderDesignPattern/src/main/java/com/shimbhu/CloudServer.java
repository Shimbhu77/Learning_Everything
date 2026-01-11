package com.shimbhu;

public class CloudServer {

    private String serverName;
    private String region;
    private Integer cpuCores;
    private Integer ramSize;
    private Integer storageSize;
    private String osType;

    @Override
    public String toString() {
        return "CloudServer{" +
                "serverName='" + serverName + '\'' +
                ", region='" + region + '\'' +
                ", cpuCores=" + cpuCores +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", osType='" + osType + '\'' +
                '}';
    }

    private CloudServer(Builder builder) {
        this.serverName = builder.serverName;
        this.region = builder.region;
        this.cpuCores = builder.cpuCores;
        this.ramSize = builder.ramSize;
        this.storageSize = builder.storageSize;
        this.osType = builder.osType;
    }

    public static class Builder {
        private String serverName;
        private String region;
        private Integer cpuCores;
        private Integer ramSize;
        private Integer storageSize;
        private String osType;

        public Builder(String serverName, String region){
            this.serverName = serverName;
            this.region = region;
        }

        public Builder cpuCores(Integer cpuCores){
            this.cpuCores = cpuCores;
            return this;
        }

        public Builder ramSize(Integer ramSize){
            this.ramSize = ramSize;
            return this;
        }

        public Builder storageSize(Integer storageSize){
            this.storageSize = storageSize;
            return this;
        }

        public Builder osType(String osType){
            this.osType = osType;
            return this;
        }

        public CloudServer build(){
            return new CloudServer(this);
        }

    }
}
