package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwrechController {
    @RequestMapping(value="shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return ShipwreckStub.list();
    }

    @RequestMapping(value="shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.create(shipwreck);
    }
}
