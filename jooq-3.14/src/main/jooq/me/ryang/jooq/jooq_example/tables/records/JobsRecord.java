/*
 * This file is generated by jOOQ.
 */
package me.ryang.jooq.jooq_example.tables.records;


import java.time.LocalDate;

import me.ryang.jooq.jooq_example.tables.Jobs;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobsRecord extends UpdatableRecordImpl<JobsRecord> implements Record6<Integer, Integer, String, LocalDate, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq_example.jobs.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq_example.jobs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq_example.jobs.people_id</code>.
     */
    public void setPeopleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq_example.jobs.people_id</code>.
     */
    public Integer getPeopleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jooq_example.jobs.employer_name</code>.
     */
    public void setEmployerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq_example.jobs.employer_name</code>.
     */
    public String getEmployerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq_example.jobs.start_date</code>.
     */
    public void setStartDate(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq_example.jobs.start_date</code>.
     */
    public LocalDate getStartDate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>jooq_example.jobs.end_date</code>.
     */
    public void setEndDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq_example.jobs.end_date</code>.
     */
    public LocalDate getEndDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>jooq_example.jobs.role</code>.
     */
    public void setRole(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jooq_example.jobs.role</code>.
     */
    public String getRole() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, LocalDate, LocalDate, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, LocalDate, LocalDate, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Jobs.JOBS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Jobs.JOBS.PEOPLE_ID;
    }

    @Override
    public Field<String> field3() {
        return Jobs.JOBS.EMPLOYER_NAME;
    }

    @Override
    public Field<LocalDate> field4() {
        return Jobs.JOBS.START_DATE;
    }

    @Override
    public Field<LocalDate> field5() {
        return Jobs.JOBS.END_DATE;
    }

    @Override
    public Field<String> field6() {
        return Jobs.JOBS.ROLE;
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
        return getEmployerName();
    }

    @Override
    public LocalDate component4() {
        return getStartDate();
    }

    @Override
    public LocalDate component5() {
        return getEndDate();
    }

    @Override
    public String component6() {
        return getRole();
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
        return getEmployerName();
    }

    @Override
    public LocalDate value4() {
        return getStartDate();
    }

    @Override
    public LocalDate value5() {
        return getEndDate();
    }

    @Override
    public String value6() {
        return getRole();
    }

    @Override
    public JobsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public JobsRecord value2(Integer value) {
        setPeopleId(value);
        return this;
    }

    @Override
    public JobsRecord value3(String value) {
        setEmployerName(value);
        return this;
    }

    @Override
    public JobsRecord value4(LocalDate value) {
        setStartDate(value);
        return this;
    }

    @Override
    public JobsRecord value5(LocalDate value) {
        setEndDate(value);
        return this;
    }

    @Override
    public JobsRecord value6(String value) {
        setRole(value);
        return this;
    }

    @Override
    public JobsRecord values(Integer value1, Integer value2, String value3, LocalDate value4, LocalDate value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobsRecord
     */
    public JobsRecord() {
        super(Jobs.JOBS);
    }

    /**
     * Create a detached, initialised JobsRecord
     */
    public JobsRecord(Integer id, Integer peopleId, String employerName, LocalDate startDate, LocalDate endDate, String role) {
        super(Jobs.JOBS);

        setId(id);
        setPeopleId(peopleId);
        setEmployerName(employerName);
        setStartDate(startDate);
        setEndDate(endDate);
        setRole(role);
    }
}
