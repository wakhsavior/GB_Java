package tasks.Seminar_02;

import javax.sound.midi.MidiDevice;
import java.io.IOException;
import java.util.logging.*;

public class Logs {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(tasks.Seminar_02.Logs.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sForm = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(sForm);
        logger.warning("TEST LOG INFO");
        ch.setFormatter(xml);
        logger.info("TEST LOG INFO");
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        fh.setFormatter(xml);
        logger.info("TEST LOG INFO");



    }
    }

