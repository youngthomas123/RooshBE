package com.projectsem3.rooshapi.util;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ApplicationLogger {
    public static Logger GetLogger(){
        LogManager lgmngr = LogManager.getLogManager();
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
        return log;
    }
}
