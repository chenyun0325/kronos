package com.kronos.config.raw;

/**
 * @Author: jackila
 * @Date: 11:07 AM 2022-5-29
 */
public class TableInfo {
    private String tableName;
    private boolean mainTable;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public boolean isMainTable() {
        return mainTable;
    }

    public void setMainTable(boolean mainTable) {
        this.mainTable = mainTable;
    }
}
