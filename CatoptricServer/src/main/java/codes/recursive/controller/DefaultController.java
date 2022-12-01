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
    JNI jni = new JNI();

    @Get(value="test", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> test() throws IOException{
        jni.test();
        return HttpResponse.ok(
            CollectionUtils.mapOf(
                    "status", 0
            )
        );
    }

    @Get(value="quit", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> quit() throws IOException{
        jni.quit();
        return HttpResponse.ok(
                CollectionUtils.mapOf(
                        "status", 0
                )
        );
    }

    @Get(value="reset", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> reset() throws IOException{
        jni.reset();
        return HttpResponse.ok(
                CollectionUtils.mapOf(
                        "status", 0
                )
        );
    }

    @Post(value = "move", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Map<String, Object>> move(Command command) throws IOException{

        int motor = command.getMotor();
        int steps = command.getSteps();
        int row = command.getRow();
        int column = command.getColumn();
        int surface = command.getSurface();

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