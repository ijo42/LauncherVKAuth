package pro.gravit.launcher.events.request;

import java.util.UUID;

import pro.gravit.launcher.LauncherNetworkAPI;
import pro.gravit.launcher.events.RequestEvent;
import pro.gravit.utils.event.EventInterface;

public class ErrorRequestEvent extends RequestEvent implements EventInterface {
    public static UUID uuid = UUID.fromString("0af22bc7-aa01-4881-bdbb-dc62b3cdac96");

    public ErrorRequestEvent(String error) {
        this.error = error;
    }

    @LauncherNetworkAPI
    public final String error;

    @Override
    public String getType() {
        return "error";
    }

    @Override
    public UUID getUUID() {
        return null;
    }
}
