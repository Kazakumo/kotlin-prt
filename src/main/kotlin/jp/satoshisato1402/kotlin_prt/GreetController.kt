package jp.satoshisato1402.kotlin_prt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greeter")
class GreetController {
    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String): HelloResponse{
        return HelloResponse("Hello ${name}")
    }
}