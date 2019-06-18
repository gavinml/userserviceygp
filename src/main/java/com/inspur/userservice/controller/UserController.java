package com.inspur.userservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/getUserInfo.ilf")
    public String getUserInfo() {
		return "{"+
				"'totalRecords': 18778,"+
				"    'resultRecords': 1,"+
				"    'aaData': ["+
				"        {"+
				"            'INT_PHONE': '8613576061337',"+
				"            'INT_START_TIME': '2015-11-15 06:02:27',"+
				"            'imsi': '460002922342585',"+
				"            'imei': '8662880204469200',"+
				"            'tac': '26897',"+
				"            'eci': '200504084',"+
				"            'apn': 'CMNET.mnc000.mcc460.gprs',"+
				"            'end_time': '2015-11-15 06:02:29',"+
				"            'app_type': '浏览下载',"+
				"            'app_subtype': '332',"+
				"            'app_content': '',"+
				"            'app_status': '0',"+
				"            'user_ipv4': '10.158.117.78',"+
				"            'appserver_ipv4': '10.0.0.172',"+
				"            'ulthroughput': '0.0010',"+
				"            'dlthroughput': '0.0005',"+
				"            'host': 'oc.umeng.com',"+
				"            'uri': 'http://oc.umeng.com/check_config_update',"+
				"            'average_delay': '786',"+
				"            'cell_name': '5ANXXXNanChangXianYuHeWan2',"+
				"            'net_type': '4G',"+
				"            'tactype_zhname': '8297-T01',"+
				"            'tacbrand_zhname': '酷派',"+
				"            'length': '532',"+
				"            'city': '0791',"+
				"            'interface': '11',"+
				"            'xdr_id': '94865886430588141',"+
				"            'rat': '6',"+
				"            'machine_ip_add_type': '1',"+
				"            'sgw_ip_add': '100.82.254.20',"+
				"            'enb_ip_add': '100.82.23.246',"+
				"            'sgw_port': '2152',"+
				"            'enb_port': '2152',"+
				"            'enb_u_teid': '159954',"+
				"            'sgw_u_teid': '213929530',"+
				"            'xdr_type': '103',"+
				"            'protocol': '1',"+
				"            'user_ipv6': '',"+
				"            'user_port': '33940',"+
				"            'l4_protocol': '0',"+
				"            'appserver_ipv6': '',"+
				"            'appserver_port': '80',"+
				"            'ulpackets': '7',"+
				"            'dlpackets': '5',"+
				"            'ultcp_disorder_packets': '0',"+
				"            'dltcp_disorder_packets': '0',"+
				"            'ultcp_retransfer_packets': '0',"+
				"            'dltcp_retransfer_packets': '0',"+
				"            'ultcp_response_time': '188',"+
				"            'dltcp_response_time': '37',"+
				"            'ultcp_flag_packets': '0',"+
				"            'dltcp_flag_packets': '0',"+
				"            'tcp_link_suc_to_fi_delay_tran_req': '11',"+
				"            'delay_fr_fi_tra_re_to_fi_re_pac': '1',"+
				"            'window_size': '5792',"+
				"            'mss_size': '1400',"+
				"            'tcplink_count': '1',"+
				"            'tcplink_state': '0',"+
				"            'finish': '1',"+
				"            'http_version': '3',"+
				"            'Transaction_Type': '5',"+
				"            'http_wap_state_of_affairs': '200',"+
				"            'first_http_response_packet_delay_': '42',"+
				"            'final_http_content_package_delay': '42',"+
				"            'final_confirmation_packet_ack_delay': '69',"+
				"            'x_online_host': 'oc.umeng.com',"+
				"            'user_agent': 'Dalvik/1.6.0 (Linux; U; Android 4.4.4; Coolpad 8297-T01 Build/KTU84P)',"+
				"            'http_content_type': 'application/json',"+
				"            'refer_uri': '',"+
				"            'cookie': '',"+
				"            'content-length': '22',"+
				"            'target_behavior': '0',"+
				"            'wtp_interrupt_type': '0',"+
				"            'wtp_interrupt_reason': '0',"+
				"            'title': '',"+
				"            'key_word': '',"+
				"            'action': '3',"+
				"            'succ_flag': '0',"+
				"            'action_delay': '305',"+
				"            'browse_tool': '0',"+
				"            'portals': '0',"+
				"            'sequence': '1',"+
				"            'rst_interrupt': '0',"+
				"            'fin_interrupt': '2'"+
				"        }"+
				"    ],"+
				"    'resultCode': '0',"+
				"    'message': 'success'"+
				"}";


//		List<Map<String,String>> map = new ArrayList<Map<String,String>>();
//		
//		
//		
//		return map;
    }
}
