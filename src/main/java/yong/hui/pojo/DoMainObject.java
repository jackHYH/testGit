package yong.hui.pojo;

public class DoMainObject {
    private Integer domainId;

    private String mdmObject;

    private String mdmObjectName;

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getMdmObject() {
        return mdmObject;
    }

    public void setMdmObject(String mdmObject) {
        this.mdmObject = mdmObject == null ? null : mdmObject.trim();
    }

    public String getMdmObjectName() {
        return mdmObjectName;
    }

    public void setMdmObjectName(String mdmObjectName) {
        this.mdmObjectName = mdmObjectName == null ? null : mdmObjectName.trim();
    }
}