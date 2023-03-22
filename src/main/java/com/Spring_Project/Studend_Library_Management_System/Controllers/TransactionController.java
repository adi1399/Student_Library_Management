package com.Spring_Project.Studend_Library_Management_System.Controllers;


import com.Spring_Project.Studend_Library_Management_System.DTOs.IssueBookRequestDto;
import com.Spring_Project.Studend_Library_Management_System.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {


    @Autowired
    TransactionService transactionService;

    @PostMapping("issueBook")
    public String issueBook(@RequestBody IssueBookRequestDto issueBookRequestDto){

        try{
            return transactionService.issueBook(issueBookRequestDto);
        }catch (Exception e){
            return e.getMessage();
        }

    }

    @GetMapping("/getTxnInfo")
    public String getTransactionEntry(@RequestParam("bookId")Integer bookId, @RequestParam
            ("cardId")Integer cardId){

        return transactionService.getTransactions(bookId,cardId);
    }
}