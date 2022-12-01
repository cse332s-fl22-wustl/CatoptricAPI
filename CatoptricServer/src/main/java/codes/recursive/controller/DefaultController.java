package codes.recursive.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import java.io.*;
import java.util.Map;

import JNI.JNI;
import codes.recursive.Command;

@Controller("/")
public class DefaultController {

    @Get(value="test", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> test() throws IOException{
        new JNI().testing();
        return HttpResponse.ok(
            CollectionUtils.mapOf(
                    "status", 0
            )
        );
    }

    @Get(value="quit", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> quit() throws IOException{
        return HttpResponse.ok(
                CollectionUtils.mapOf(
                        "status", 0
                )
        );
    }

    @Get(value="reset", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> reset() throws IOException{
        return HttpResponse.ok(
                CollectionUtils.mapOf(
                        "status", 0
                )
        );
    }

    @Post(value = "move", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> move(Command command) throws IOException{

        String motor = command.getMotor();
        String steps = command.getSteps();
        String row = command.getRow();
        String column = command.getColumn();
        String surface = command.getSurface();

        return HttpResponse.ok(
                CollectionUtils.mapOf(
                    "motor", motor,
                    "steps", steps,
                    "row", row,
                    "column", column,
                    "surface", surface
                    )
        );
    }
}