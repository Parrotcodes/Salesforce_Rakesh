trigger demoTest on Account (before insert) {
    System.debug('before insert');
}