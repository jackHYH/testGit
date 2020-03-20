package yong.hui.pojo;

public class Provider {
    private String ptable;

    private String ptableName;

    private String field;

    private String fieldName;

    private String type;

    private String required;

    private Integer linenum;

    public String getPtable() {
        return ptable;
    }

    public void setPtable(String ptable) {
        this.ptable = ptable == null ? null : ptable.trim();
    }

    public String getPtableName() {
        return ptableName;
    }

    public void setPtableName(String ptableName) {
        this.ptableName = ptableName == null ? null : ptableName.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required == null ? null : required.trim();
    }

    public Integer getLinenum() {
        return linenum;
    }

    public void setLinenum(Integer linenum) {
        this.linenum = linenum;
    }
}