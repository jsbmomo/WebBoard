package com.jeon.board.global.config;


import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;


public class MessageConverter extends MappingJackson2HttpMessageConverter {

//  private final HttpServletRequest request;
//
//  @Autowired
//  public MessageConverter(HttpServletRequest request) {
//    this.request = request;
//  }
//
//  @Override
//  public Object read(Type type, @Nullable Class<?> contextClass, HttpInputMessage inputMessage) throws
//      IOException {
//    JavaType javaType = this.getJavaType(type, contextClass);
//    return this.objectMapper.readValue(inputMessage.getBody(), javaType);
//  }
}
