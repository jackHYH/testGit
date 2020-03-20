package yong.hui.pojo;

public class Mdm {
    private Integer linenum;

    private String mdmObject;

    private String mdmObjectName;

    private String mdmTable;

    private String mdmTableName;

    private String field;

    private String fieldName;

    private String fieldType;

    private String required;

    public Integer getLinenum() {
        return linenum;
    }

    public void setLinenum(Integer linenum) {
        this.linenum = linenum;
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

    public String getMdmTable() {
        return mdmTable;
    }

    public void setMdmTable(String mdmTable) {
        this.mdmTable = mdmTable == null ? null : mdmTable.trim();
    }

    public String getMdmTableName() {
        return mdmTableName;
    }

    public void setMdmTableName(String mdmTableName) {
        this.mdmTableName = mdmTableName == null ? null : mdmTableName.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType == null ? null : fieldType.trim();
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required == null ? null : required.trim();
    }
}