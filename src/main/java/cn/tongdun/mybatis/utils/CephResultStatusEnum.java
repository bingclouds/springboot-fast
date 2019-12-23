package cn.tongdun.mybatis.utils;

public enum CephResultStatusEnum {
    SUCCESS(200, "SUCCESS", "成功"),//成功
    ERROR(500, "ERROR", "失败"),//失败
    PARAM_ERROR(201, "PARAMETER ERROR", "参数错误"),
    SYSTEM_ERROR(301, "SYSTEM ERROR", "系统错误"),
    DATAISEMPTY(401, "DATAISEMPTY", "数据为空"),
    LOGICAL_EXCEPTION(501, "LOGICAL_EXCEPTION", "try catch异常");//用于try catch 测试

    private final int code;

    private final String desc;

    private final String productDescription;

    CephResultStatusEnum(int code, String desc, String productDescription) {
        this.code = code;
        this.desc = desc;
        this.productDescription = productDescription;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
