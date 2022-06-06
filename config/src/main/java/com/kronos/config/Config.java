package com.kronos.config;

import com.kronos.config.raw.DataSource;
import com.kronos.config.raw.Sinker;
import com.kronos.config.raw.TableInfo;

import java.util.List;

/**
 * @Author: jackila
 * @Date: 10:45 PM 2022-5-28
 */
public class Config {
    private List<DataSource> dataSources;
    private List<TableInfo> tableInfos;
    private List<String> relations;
    private Sinker sinker;

    public List<DataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public List<TableInfo> getTableInfos() {
        return tableInfos;
    }

    public void setTableInfos(List<TableInfo> tableInfos) {
        this.tableInfos = tableInfos;
    }

    public List<String> getRelations() {
        return relations;
    }

    public void setRelations(List<String> relations) {
        this.relations = relations;
    }

    public Sinker getSinker() {
        return sinker;
    }

    public void setSinker(Sinker sinker) {
        this.sinker = sinker;
    }
}
