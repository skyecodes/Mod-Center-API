/*
 * This file is generated by jOOQ.
*/
package com.franckyi.modcenter.api.jooq.tables;


import com.franckyi.modcenter.api.jooq.ModCenterDatabase;
import com.franckyi.modcenter.api.jooq.Keys;
import com.franckyi.modcenter.api.jooq.tables.records.FilesRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = 1818776077;

    /**
     * The reference instance of <code>franckyi_modcenter.files</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>franckyi_modcenter.files.fileId</code>.
     */
    public final TableField<FilesRecord, Integer> FILEID = createField("fileId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.fileName</code>.
     */
    public final TableField<FilesRecord, String> FILENAME = createField("fileName", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.type</code>.
     */
    public final TableField<FilesRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.size</code>.
     */
    public final TableField<FilesRecord, String> SIZE = createField("size", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.uploaded</code>.
     */
    public final TableField<FilesRecord, Date> UPLOADED = createField("uploaded", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.downloads</code>.
     */
    public final TableField<FilesRecord, Integer> DOWNLOADS = createField("downloads", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.fileUrl</code>.
     */
    public final TableField<FilesRecord, String> FILEURL = createField("fileUrl", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>franckyi_modcenter.files.projectId</code>.
     */
    public final TableField<FilesRecord, Integer> PROJECTID = createField("projectId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>franckyi_modcenter.files</code> table reference
     */
    public Files() {
        this("files", null);
    }

    /**
     * Create an aliased <code>franckyi_modcenter.files</code> table reference
     */
    public Files(String alias) {
        this(alias, FILES);
    }

    private Files(String alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(String alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ModCenterDatabase.MOD_CENTER_DATABASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FilesRecord> getPrimaryKey() {
        return Keys.KEY_FILES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilesRecord>> getKeys() {
        return Arrays.<UniqueKey<FilesRecord>>asList(Keys.KEY_FILES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FilesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilesRecord, ?>>asList(Keys.FILES_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Files as(String alias) {
        return new Files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(name, null);
    }
}