package com.mjj.config;

public class AlipayConfig {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    public static String app_id = "2021000117669666";

    // 商户私钥，您的PKCS8格式RSA2私钥，就是我们用工具生成的，我让你先保存起来的
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCFjcsYM270vqxhrq0ZwY/WWpwDlFjezRMwatHGzLxmI24msQFrgpQUdz1alNn/8SZR8zwxB3uejYinccxSwHfB8Rlpng1HDLDaPiXkeAqtKIWeb51+XK5iqqhH6aVTMVe3EsqDjjMvqPBUsKdGKhgCAthw+uZfZg9jswq/5TN8H+Le22jopUpyWKm8S4dguN3gvIl+OWlSY8kIDq/bMQYr6DEv0OcMa/HQv02DJ0bYpAwcUxMa7XHnGYHKt+naehBMqMYC/1jjGrZI7eDA77QitE1yUbJ3Xb3T0OWAw+B19Q6Fu11RyJ+dg756mNxGt/MiokR/M5xNMIdW7Ikb/eZ7AgMBAAECggEAF1hx6AkVnDK4b1rZZ2cufYnZO8bywf+XGx+RC+89/5yx5JGMbf6lY+50CyF5+gNtb2XVX7yvH0geWybJUK3UQVKj3pKCP6k4QO4cMZPKSfqLYOah4TTSRu0N/YQaIjC95IKkY9q3l90wJZ27n8g76h4VN6qkGoj8p7DkcCbgmRG3XAxv2vIhCDNul4/QI5dpmB4kWoEWvxC7qH6kFDozSQq3ogOVwskHuzXg5yTRduSTWDJXT8H1VlGvvUaTxjYFkJ4NpHPBGGJFAxRBrsgmk2x79jUhFvhtxCRtCfrE+jtr9d5Fc0TTyLyq2LRuLCClbfvA9DyHiUgbOkV0yvvqAQKBgQDqhOq2W4lWl1UGyXeh+GRHdIdVGDIFDMcZLi7U4jWmKsg62ilZ6lndT6XSoNYX6iew1DDkABOu1+Jb3B0Q7DCdzCIrfyXCilUiiNK78MI59u/uQxjOllwf1D5x851HV7xU8fIRBzfYIRPIr/PtlY6xVVMdJY7QPWYmsSOEV+hb3wKBgQCRyWiQxvyUKTdUCy0cCQ42+DD+N21DX+csbU8goRCo3thwVFTJDspWMn5kyHI+C0/K6C9sjiEoDw731RQH1y9w7GwvMkyXgXTUtBmbcv88DrzgjfJKlKMeyj/VMikfzLFviYvnyZ7sXglD+SQQSduiufm5lcRa8tZu5WmTalNI5QKBgQCEjGVgdjIUd+n9sQbly89Zt5n51XgH9KXfLIQZnFT4Ovv6j22JvXPXKvotJux6jcSrI/MSGp0FWE0+4BSpiOUdes/hR7be0nK11yFMShJs0o3fW5r8wG0HLF2y6B7/wK3YUPsg9rRwepmE9zXmFX6V6gTU13J1bg57VekeFtVkfwKBgHMsWeaevaZTVXmZBr8yTD+THimIIlLq7hgEF1IgzKeMvhMoHH9mpuUoKQB39wEbMKONgQHS21DpbJrQhG2ZS8p7jRBQPYAn7uOnkN9lH00UG5WPro3LFX9aqslEQobz0G3cjWHFwD7eH5XKuvn/T3wkTqyWLDTpygx8Q0cJ5dgdAoGBAIKDADCq3wAxf7R2rFdfEttHtWLMzmPGEsHtlO5FWYZ1w9B2M4vkrArbslHznQ9REa4QKWA3BK/9DfJLDBNE/Z0UprDvtp8YHr3Pty6C2YcJyH91aYfFAWHwjpNDckGCBnihXao+e3dmF5/PTvD38V7ydlqoz/+txL2S/urDABTl";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1XywPOKQ6th7ez5sIZeh3jzRDcsyMctUiYsdli4yR3eqqhqc63I/atam8wZ3bB96u3A1R8Siyli60dDZ0iO1mA7Js9sXFwbXjc3bHdfIBxpaOTXF7MnRPEKMYqaccVBXPPuSBtuvqBiNogCr3boGyCbplw22Ymt3lM+AqqYApAJIzh18n1EHCu0Z1qPN+gKJuAxcY77e9Y/VzQYjzzlSDi9KBQBo/PfjqbJP8Sn2RIQXnlR8AI8o/9+HLS+chNvcE58kF4VD2VMQlfhFJitNAePu8NiiXS0C2jlivIXnqV+DTYGeqRE2zlO8mdFzEEz1iZvEhjkhZSi6xdWBKJRVpQIDAQAB//EmUfM8MQd7no2Ip3HMUsB3wfEZaZ4NRwyw2j4l5HgKrSiFnm+dflyuYqqoR+mlUzFXtxLKg44zL6jwVLCnRioYAgLYcPrmX2YPY7MKv+UzfB/i3tto6KVKclipvEuHYLjd4LyJfjlpUmPJCA6v2zEGK+gxL9DnDGvx0L9NgydG2KQMHFMTGu1x5xmByrfp2noQTKjGAv9Y4xq2SO3gwO+0IrRNclGyd12909DlgMPgdfUOhbtdUcifnYO+epjcRrfzIqJEfzOcTTCHVuyJG/3mewIDAQAB";

    // 签名方式
    public static String sign_type = "RSA2";
    // 服务器异步通知页面路径
    public static String notify_url = "";

    // 页面跳转同步通知页面路径
    public static String return_url = "";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

}
