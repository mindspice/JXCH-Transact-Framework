package io.mindspice.jxch.transact.logging;

public interface TLogger {


    void log(Class<?> clazz, TLogLevel TLogLevel, String message);

    void log(Class<?> clazz, TLogLevel TLogLevel, String message, Exception ex);

}
