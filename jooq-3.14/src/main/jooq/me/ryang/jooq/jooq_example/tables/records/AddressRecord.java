/*
 * This file is generated by jOOQ.
 */
package me.ryang.jooq.jooq_example.tables.records;


import me.ryang.jooq.jooq_example.tables.Address;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> implements Record5<Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq_example.address.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq_example.address.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq_example.address.people_id</code>.
     */
    public void setPeopleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq_example.address.people_id</code>.
     */
    public Integer getPeopleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jooq_example.address.street_name</code>.
     */
    public void setStreetName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq_example.address.street_name</code>.
     */
    public String getStreetName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq_example.address.suburb</code>.
     */
    public void setSuburb(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq_example.address.suburb</code>.
     */
    public String getSuburb() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jooq_example.address.post_code</code>.
     */
    public void setPostCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq_example.address.post_code</code>.
     */
    public String getPostCode() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Address.ADDRESS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Address.ADDRESS.PEOPLE_ID;
    }

    @Override
    public Field<String> field3() {
        return Address.ADDRESS.STREET_NAME;
    }

    @Override
    public Field<String> field4() {
        return Address.ADDRESS.SUBURB;
    }

    @Override
    public Field<String> field5() {
        return Address.ADDRESS.POST_CODE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPeopleId();
    }

    @Override
    public String component3() {
        return getStreetName();
    }

    @Override
    public String component4() {
        return getSuburb();
    }

    @Override
    public String component5() {
        return getPostCode();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPeopleId();
    }

    @Override
    public String value3() {
        return getStreetName();
    }

    @Override
    public String value4() {
        return getSuburb();
    }

    @Override
    public String value5() {
        return getPostCode();
    }

    @Override
    public AddressRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AddressRecord value2(Integer value) {
        setPeopleId(value);
        return this;
    }

    @Override
    public AddressRecord value3(String value) {
        setStreetName(value);
        return this;
    }

    @Override
    public AddressRecord value4(String value) {
        setSuburb(value);
        return this;
    }

    @Override
    public AddressRecord value5(String value) {
        setPostCode(value);
        return this;
    }

    @Override
    public AddressRecord values(Integer value1, Integer value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressRecord
     */
    public AddressRecord() {
        super(Address.ADDRESS);
    }

    /**
     * Create a detached, initialised AddressRecord
     */
    public AddressRecord(Integer id, Integer peopleId, String streetName, String suburb, String postCode) {
        super(Address.ADDRESS);

        setId(id);
        setPeopleId(peopleId);
        setStreetName(streetName);
        setSuburb(suburb);
        setPostCode(postCode);
    }
}
