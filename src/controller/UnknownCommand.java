package controller;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by User on 03.05.2018.
 */
public class UnknownCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward("unknown");
    }
}