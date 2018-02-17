package com.felipe.exportapplication.service

import com.felipe.exportapplication.model.Inventory
import org.springframework.stereotype.Service

@Service("IMPORT_INVENTORY_FROM_ATHENA")
class InventoryService {
    
    def getInventories: List[Inventory] = ???
    def insertInventories = ???
}
