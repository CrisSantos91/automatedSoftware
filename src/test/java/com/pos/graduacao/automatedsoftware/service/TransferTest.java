package com.pos.graduacao.automatedsoftware.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransferTest {

    @Test
    void deveRealizarTransferencia() {
        Assertions.assertTrue(Transfer.deveRealizarTransferencia());
    }
}
