package br.com.k21.sistemavendas;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraComissaoController {


    @RequestMapping("/calculadoracomissao")
    public CalculadoraComissao calculadoracomissao(@RequestParam(value="valorvenda", defaultValue="0") double valorVenda) {
        return new CalculadoraComissao(valorVenda);
    }
}