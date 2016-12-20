package com.fengdai.suggestion.api;

import com.fengdai.base.dubbo.configure.AbstractApiProvider;
import com.fengdai.suggestion.service.MySuggestionService;

public class SuggestionApiProvider extends AbstractApiProvider {

	private static final SuggestionApiProvider singleton = new SuggestionApiProvider();

	static SuggestionApiProvider getInstance() {
		return SuggestionApiProvider.singleton;
	}

	public static MySuggestionService getMySuggestionService() {
		return getInstance().getBean(MySuggestionService.class);
	}

	@Override
	protected String register() {
		return dubboConsumer.getString("suggestion.dubbo");
	}
}
