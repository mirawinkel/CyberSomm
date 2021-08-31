package com.mira.cybersomm.exceptions;

import lombok.Getter;

@Getter
public enum SqlError {
    NO_RECORD_CHOSEN(0, "No Record Selected"),
    NO_RECORD_FOUND(1, "Matching Record Not Found");

    private final int code;
    private final String description;

    private SqlError(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return "SqlError{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
