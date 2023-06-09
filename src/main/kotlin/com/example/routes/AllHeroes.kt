package com.example.routes

import com.example.models.ApiResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.lang.NumberFormatException

fun Route.getAllHeroes(){
    get("/boruto/heroes"){
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)
            call.respond(
                message = page
            )
        }
        catch (e: NumberFormatException){
            call.respond(
                message = ApiResponse(false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        }
        catch (e: IllegalArgumentException){
            call.respond(
                message = ApiResponse(false, message = "Heroes Not Found"),
                status = HttpStatusCode.BadRequest
            )
        }

    }
}