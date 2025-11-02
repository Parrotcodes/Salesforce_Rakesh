public class DebugLevelExample {
    public static void showingDifferentLogs() {
        System.debug('--- Debug Levels ---');
        
        //The amount of information logged by Debug levels
        System.debug(LoggingLevel.ERROR, 'This is an ERROR message');
        System.debug(LoggingLevel.WARN, 'This is a WARNING message');
        System.debug(LoggingLevel.INFO, 'This is an INFO message');
        System.debug(LoggingLevel.DEBUG, 'This is a DEBUG message');
        System.debug(LoggingLevel.FINE, 'This is a FINE message');
        System.debug(LoggingLevel.FINER, 'This is a FINER message');
        System.debug(LoggingLevel.FINEST, 'This is a FINEST message');

    }
}