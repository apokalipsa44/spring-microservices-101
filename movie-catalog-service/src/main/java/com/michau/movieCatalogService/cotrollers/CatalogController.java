package com.michau.movieCatalogService.cotrollers;


import com.michau.movieCatalogService.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @RequestMapping("/{userId}")
    private List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CatalogItem("Passion", "weak as shit", 4)
        );
    }

}


