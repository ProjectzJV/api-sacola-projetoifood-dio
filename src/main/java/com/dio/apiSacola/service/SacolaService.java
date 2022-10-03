package com.dio.apiSacola.service;

import com.dio.apiSacola.model.Item;
import com.dio.apiSacola.model.Sacola;
import com.dio.apiSacola.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
