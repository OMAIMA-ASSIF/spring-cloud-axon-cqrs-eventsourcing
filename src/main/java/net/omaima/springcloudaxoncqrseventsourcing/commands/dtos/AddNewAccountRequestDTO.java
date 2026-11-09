package net.omaima.springcloudaxoncqrseventsourcing.commands.dtos;

public record AddNewAccountRequestDTO(double initialBalance, String currency) {
}