//package com.prowings.collections;
//
//public class WebClient {
//	
//	public ResponseEntity<ApiResponse> process()
//	{
//		
//		response = webClient.post()
//		        .uri(configuration.getTargetProxyUr1())
//		        .headers(httpHeaders -> httpHeaders.addAll(headers))
//		        .body(BodyInserters.fromValue(data))
//		        .retrieve()
//		        .toEntity(ApiResponse.class)
//		        .flatMap(responseEntity -> {
//		            // Handle successful response
//		            if (responseEntity.getStatusCode().is2xxSuccessful()) {
//		                return Mono.just(ResponseEntity.ok(responseEntity.getBody()));
//		            } else {
//		                // Handle error response
//		                // Fetch the error body directly from the response entity
//		                return Mono.just(ResponseEntity
//		                        .status(responseEntity.getStatusCode())
//		                        .body(responseEntity.getBody() != null ? responseEntity.getBody() : new ApiResponse()));
//		            }
//		        })
//		        .onErrorResume(error -> {
//		            // Handle exceptions that occur during the request
//		            ApiResponse errorResponse = new ApiResponse();
//		            errorResponse.setError("Error occurred while processing the request: " + error.getMessage());
//		            return Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse));
//		        });		
//		
//	}
//
//}
