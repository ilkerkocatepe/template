package dev.ilkerk.template.application.command;

public interface ICommandHandler<TCommand extends ICommand, TResult> {
    TResult handle(TCommand command);
}
