package cn.tongdun.mybatis.model;

public class DimMilestoneGpsTmp {
    private String routeBlock;

    private Short direction;

    private String milestone;

    private String latitude;

    private String longitude;

    public DimMilestoneGpsTmp(String routeBlock, Short direction, String milestone, String latitude, String longitude) {
        this.routeBlock = routeBlock;
        this.direction = direction;
        this.milestone = milestone;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public DimMilestoneGpsTmp() {
        super();
    }

    public String getRouteBlock() {
        return routeBlock;
    }

    public void setRouteBlock(String routeBlock) {
        this.routeBlock = routeBlock == null ? null : routeBlock.trim();
    }

    public Short getDirection() {
        return direction;
    }

    public void setDirection(Short direction) {
        this.direction = direction;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone == null ? null : milestone.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }
}