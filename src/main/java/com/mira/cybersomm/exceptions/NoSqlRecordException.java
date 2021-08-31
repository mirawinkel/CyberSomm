package com.mira.cybersomm.exceptions;

import lombok.Getter;

@Getter
public class NoSqlRecordException extends Exception{

    private final SqlError code;

    public NoSqlRecordException(String errorMessage, Throwable cause, SqlError code) {
        super(errorMessage, cause);
        this.code = code;
    }

    public NoSqlRecordException(SqlError code) {
        super();
        this.code = code;
    }

    public NoSqlRecordException(String message, SqlError code) {
        super(message);
        this.code = code;
    }

    public NoSqlRecordException(Throwable cause, SqlError code) {
        super(cause);
        this.code = code;
    }

}
