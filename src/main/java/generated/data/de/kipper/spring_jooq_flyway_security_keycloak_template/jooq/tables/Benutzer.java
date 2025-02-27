/*
 * This file is generated by jOOQ.
 */
package de.kipper.spring_jooq_flyway_security_keycloak_template.jooq.tables;


import de.kipper.spring_jooq_flyway_security_keycloak_template.jooq.Keys;
import de.kipper.spring_jooq_flyway_security_keycloak_template.jooq.Public;
import de.kipper.spring_jooq_flyway_security_keycloak_template.jooq.tables.records.BenutzerRecord;

import java.util.Collection;
import java.util.UUID;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Benutzer extends TableImpl<BenutzerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.benutzer</code>
     */
    public static final Benutzer BENUTZER = new Benutzer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BenutzerRecord> getRecordType() {
        return BenutzerRecord.class;
    }

    /**
     * The column <code>public.benutzer.id</code>.
     */
    public final TableField<BenutzerRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.benutzer.name</code>.
     */
    public final TableField<BenutzerRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    private Benutzer(Name alias, Table<BenutzerRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Benutzer(Name alias, Table<BenutzerRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.benutzer</code> table reference
     */
    public Benutzer(String alias) {
        this(DSL.name(alias), BENUTZER);
    }

    /**
     * Create an aliased <code>public.benutzer</code> table reference
     */
    public Benutzer(Name alias) {
        this(alias, BENUTZER);
    }

    /**
     * Create a <code>public.benutzer</code> table reference
     */
    public Benutzer() {
        this(DSL.name("benutzer"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<BenutzerRecord> getPrimaryKey() {
        return Keys.BENUTZER_PKEY;
    }

    @Override
    public Benutzer as(String alias) {
        return new Benutzer(DSL.name(alias), this);
    }

    @Override
    public Benutzer as(Name alias) {
        return new Benutzer(alias, this);
    }

    @Override
    public Benutzer as(Table<?> alias) {
        return new Benutzer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Benutzer rename(String name) {
        return new Benutzer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Benutzer rename(Name name) {
        return new Benutzer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Benutzer rename(Table<?> name) {
        return new Benutzer(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Benutzer where(Condition condition) {
        return new Benutzer(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Benutzer where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Benutzer where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Benutzer where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Benutzer where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Benutzer where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Benutzer where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Benutzer where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Benutzer whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Benutzer whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
