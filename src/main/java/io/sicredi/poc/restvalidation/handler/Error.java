package io.sicredi.poc.restvalidation.handler;

import java.util.List;

public record Error (String message, List<ErrorDetail> details) { }
