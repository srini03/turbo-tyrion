package com.batch.test;

import java.util.Map.Entry;

import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class FieldSetSqlParameterSourceProvider implements ItemSqlParameterSourceProvider<FieldSet> {

    public SqlParameterSource createSqlParameterSource(FieldSet item) {
        MapSqlParameterSource sps = new MapSqlParameterSource();
        for (Entry<Object, Object> entry : item.getProperties().entrySet()) {
            sps.addValue(entry.getKey().toString(), entry.getValue());
        }
        return sps;
    }
}
