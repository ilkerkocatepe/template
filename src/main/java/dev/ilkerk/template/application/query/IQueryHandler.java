package dev.ilkerk.template.application.query;

public interface IQueryHandler<TQuery extends IQuery, TResult> {
    TResult handle(TQuery query) throws Exception;
}