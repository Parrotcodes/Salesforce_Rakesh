trigger AccountBeforeTrigger1 on Account (before update) {
    Account acc = trigger.new[0];
    acc.Name = acc.Name + ' Ltmd';
}