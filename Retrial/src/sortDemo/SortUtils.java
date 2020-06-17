package sortDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortUtils {
	
	/**
	 * ð������:
	 * ð��������һ�ּ򵥵������㷨�����ظ����߷ù�Ҫ���������;
	 * һ�αȽ�����Ԫ��,������ǵ�˳�����Ͱ����ǽ�������;
	 * �߷����еĹ������ظ��Ľ���,ֱ��û������Ҫ������Ԫ�أ�Ҳ����˵�������Ѿ�������ɡ�
	 * @param sortArray
	 * @return
	 */
	public static int[] bubbleSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		for(int i=0;i<sortArray.length;i++){//ÿһ�������ͷ��ʼ�����ȽϽ��н���������������С��Ԫ�طŵ�����ĩβ�Ѿ�����������У���Ҫ�������������������ĳ���
			boolean is_swap = false;//��־�����������Ƿ����˽�������û�з���������˵�������Ѿ����򣬿���ֱ�ӽ�������
			for(int j=0;j<sortArray.length-1-i;j++){//ÿ�δ�ͷ��ʼ���������Ƚϣ���i���������ʾ��������i��Ԫ���Ѿ���������j<sortArray.length-1-i
				if(sortArray[j]>sortArray[j+1]){//ÿ����������Ԫ�طŵ�����ĩβ��Ҳ������������
					int temp = sortArray[j];
					sortArray[j] = sortArray[j+1];
					sortArray[j+1] = temp;
					is_swap = true;
				}
			}
			if(!is_swap){//��������û�з���Ԫ�ؽ��������������Ѿ�����ֱ�ӽ���
				break;
			}
		}
		return sortArray;
	}
	/**
	 * ѡ������:
	 * ѡ��������һ�ּ�ֱ�۵������㷨��
	 * ������δ�����������ҵ���С����Ԫ�أ���ŵ����������е���ʼλ��;
	 * Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��
	 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
	 * @param sortArray
	 * @return
	 */
	public static int[] selectionSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		for(int i=0;i<sortArray.length;i++){//ÿһ������Ѱ��һ����С��Ԫ�طŵ����鿪ͷ�Ѿ�����������У������������Ϊ����ĳ���
			int minIndex = i;//��������Ѱ�ҵĵ���СԪ�ص�������Ĭ��Ϊi��i��ʾ������������Ѱ�ҵ���СԪ��Ӧ�ò����λ��
			for(int j=i+1;j<sortArray.length;j++){//��i������˵�����鿪ͷ��i��Ԫ���Ѿ���������Ѱ����С��Ԫ��ʱ�ӵ�i+1��Ԫ�ؿ�ʼ
				if(sortArray[j]<sortArray[minIndex]){//Ԫ�ص�ֵ�ȵ�ǰ��СԪ�ص�ֵСʱ�����±�������Ѱ�ҵ���СԪ������
					minIndex = j;
				}
			}
			if(minIndex!=i){//�����СԪ�ص���������i�򽻻�����ΪminIndex��i������Ԫ��
				int temp = sortArray[i];
				sortArray[i] = sortArray[minIndex];
				sortArray[minIndex] = temp;
			}
		}
		return sortArray;
	}
	/**
	 * ��������:
	 * ����������һ�ּ�ֱ�۵������㷨��
	 * ����ͨ�������������У�����δ�������ݣ��������������дӺ���ǰɨ�裬�ҵ���Ӧλ�ò�����,
	 * �ڴӺ���ǰɨ������У���Ҫ������������Ԫ�������Ųλ��Ϊ����Ԫ���ṩ����ռ䡣
	 * @param sortArray
	 * @return
	 */
	public static int[] insertionSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		for(int i=0;i<sortArray.length-1;i++){
			//���������һ��Ԫ�������������У�����Ԫ����δ��������,������Ҫɨ�裨����˵���򣩵��ܴ�����δ�������е�Ԫ�ظ���,����sortArray.length-1�����iӦ��С��sortArray.length-1
			//i��ʾ���������е����һ��Ԫ�ص�������ÿ����Ҫ��i��ʼ��ǰɨ��
			int index = i;//���Ѿ������������ɨ�������,��ʼΪ���������е����һ��Ԫ�ص�����
			int temp = sortArray[index+1];//δ�������еĵ�һ��Ԫ����������������Ľ��У�δ���������е�Ԫ�ؽ����𽥲��뵽�����������У�����δ�������л�Խ��Խ��,����δ�������еĵ�һ��Ԫ����������������ֱ������ĩβ
			while(index>=0 && temp<sortArray[index]){//�������������д����һ��Ԫ�ؿ�ʼ��ǰɨ�裬��Ҫ������������Ԫ�������Ųλ��ֱ���ҵ�����Ԫ��Ӧ�ò����λ�ã�Ȼ�����
				sortArray[index+1] = sortArray[index];
				index--;
			}
			sortArray[index+1] = temp;//����ִ�е������Ѿ��ҵ�������Ԫ�صĲ���λ�ã�index+1��������Ԫ��temp�����λ��
		}
		return sortArray;
	}
	/**
	 * ϣ������
	 * ϣ������Ҳ��һ�ֲ����������Ǽ򵥲������򾭹��Ľ�֮���һ������Ч�İ汾��Ҳ��Ϊ��С��������
	 * ϣ�������ǰѼ�¼��һ���������飨���磺����Ϊ5����ô����Ϊ0,5,10��15....����ЩԪ��Ϊһ�飩����ÿ��ʹ��ֱ�Ӳ��������㷨����
	 * ���������𽥼��٣�ÿ�������Ԫ��Խ��Խ�࣬����������1ʱ������Ԫ�ر��ֳ�һ�飬�㷨����ֹ��
	 * @param sortArray
	 * @return
	 */
	public static int[] heerSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		int increment = sortArray.length/2;//����
		while(increment>0){
			for(int i=increment;i<sortArray.length;i++){//�����ֱ�Ӳ��������������ڣ�ÿ����ǰɨ������Ųλ�ļ��Ԫ����1����Ϊ����increment��
				int index = i-increment;
				int temp = sortArray[i];
				while(index>=0 && temp<sortArray[index]){
					sortArray[index+increment] = sortArray[index];
					index -= increment;
				}
				sortArray[index+increment] = temp;
			}
			increment /= 2;//����ÿ����Сһ��
		}
		return sortArray;
	}
	/**
	 * �鲢����:
	 * ��������������кϲ����õ���ȫ��������У�����ʹÿ��������������ʹ�����жμ�����;
	 * ���������еݹ���ù鲢����ֱ��������Ԫ�ظ���Ϊ1
	 * @param sortArray
	 * @return
	 */
	public static int[] mergeSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		//�����в��Ϊ����������
		int mid = sortArray.length/2;
		int[] left = Arrays.copyOfRange(sortArray, 0, mid);
		int[] right = Arrays.copyOfRange(sortArray, mid, sortArray.length);
		//�ϲ��������������У��������������еݹ�ʹ�ù鲢����
		return merge(mergeSort(left), mergeSort(right));
	}
	/**
	 * �������鲢�����ֵ����������кϲ�Ϊһ������
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] merge(int[] left,int[] right){
		int[] result = new int[left.length+right.length];//�½�һ�����飬��СΪ�������ϲ�������ĳ���֮�ͣ���źϲ����
		for(int index=0,index_left=0,index_right=0;index<result.length;index++){//��ʼ�ϲ�
			if(index_left>=left.length){//��ߵ������Ѿ�ȫ���ϲ����˽���У���ֱ�ӽ��ұߵ����кϲ��������
				result[index] = right[index_right++];
			}else if(index_right>=right.length){//�ұߵ������Ѿ�ȫ���ϲ����˽���У���ֱ�ӽ���ߵ����кϲ��������
				result[index] = left[index_left++];
			}else if(left[index_left]<right[index_right]){//�ж�������к��ұ����е�ǰҪ�ϲ���Ԫ�صĴ�С����֤�ϲ��ĺ�Ľ����Ȼ����
				result[index] = left[index_left++];
			}else{
				result[index] = right[index_right++];
			}
		}
		return result;
	}
	/**
	 * ��������
	 * ͨ��һ�����򽫴��ż�¼����һ����׼ֵ�ָ��ɶ����������֣�����һ���ּ�¼��ֵ������һ���ֵ�ֵС
	 * ���������ּ�¼�������п��������Դﵽ������������
	 * @param sortArray
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[] quickSort(int[] sortArray,int start,int end){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		int index = partition(sortArray, start, end);
		if(index>start){
			quickSort(sortArray, start, index-1);
		}
		if(index<end){
			quickSort(sortArray, index+1, end);
		}
		return sortArray;
	}
	/**
	 * �Դ����������ָ����Χ���ջ�׼ֵ�ָ����������֣�����һ���ֵ�ֵ������һ���ֵ�ֵС�����ҷ��طָ���׼ֵ������λ��
	 * @param sortArray
	 * @param start ��ʼ��Χ
	 * @param end ������Χ
	 * @return
	 */
	public static int partition(int[] sortArray,int start,int end){
		int benchmark_index = start+(int)((end-start+1)*Math.random());//ѡȡ�Ļ�׼ֵ���������ѡȡһ��
		int index = start;//�ָ��ɵ�������������߲��ֵ�����
		swapArrayElement(sortArray, benchmark_index, end);//����׼ֵ�ŵ����һ��
		for(int i=start;i<=end;i++){//ѭ���������зָ���ֻ��Ҫ�����бȻ�׼ֵС��Ԫ�طŵ���׼ֵ����߲��֣���ô�ұ߲��־��ǱȻ�׼ֵ�������Ԫ��
			if(sortArray[i]<=sortArray[end]){//sortArray[end]���ǻ�׼ֵ
				//��ǰԪ�رȻ�׼ֵС������Ҫ����ǰԪ�طŵ���߲��֣�
				//��ǰԪ�ص��ڻ�׼ֵ���ʾ�Ѿ��ָ���ϣ���ʱindexָ���λ��Ӧ���ǻ�׼ֵ���ڵ�λ�ã���ʱ��Ҫ����׼ֵ�ŵ���λ�ã�ͨ������Ľ��������
				if(i>index){//��ǰԪ�رȻ�׼ֵС���ҵ�ǰԪ�ص�����ֵ����߲��ֵ�����������Ҫ����Ԫ�ص���߲��֣���߲��ֵķ�ΧӦ����start����>index
					//��������������������Ӧ��Ԫ��ֵ
					swapArrayElement(sortArray, index, i);
				}
				if(i<end){//������߲��ֵ���������i=end���ʾindex��ǰ�ǻ�׼ֵ���ڵ�λ�ã�����Ҫ������
					index++;
				}
			}
		}
		return index;
	}
	/**
	 * ������
	 * ���ö��������ݽṹ����Ƶ�һ�������㷨������һ��������ȫ�������Ľṹ����ͬʱ����С���󣩸��ѵ����ʣ��������ļ�ֵ����������С�ڣ����ߴ��ڣ����������ӽڵ㡣
	 * �����д������Ԫ�����й������ѣ�Ȼ�󽫸��ڵ㣨��ʱ���ڵ�������������һ��Ԫ�ؽ���λ�ã���ʱ���һ��Ԫ�����Ȼ�����һ��Ԫ���޳���Ҳ���Ƿŵ����������С�
	 * ���ʣ�µ�Ԫ�ز����ظ��������裬ֱ��ʣ�µ�Ԫ��Ϊ1
	 * @param sortArray
	 * @return
	 */
	public static int[] heapSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		for(int i=sortArray.length/2-1;i>=0;i--){//�����һ����Ҷ�ӽڵ㿪ʼ���Ϲ������ѣ����һ����Ҷ�ӽڵ������ΪsortArray.length/2-1
			adjustHeap(sortArray, i, sortArray.length);
		}
		for(int j=sortArray.length-1;j>0;j--){//����ǰ��Ĺ��죬��ʱ���ڵ��Ѿ�������Ԫ��
			swapArrayElement(sortArray, 0, j);//�����ڵ�����һ���ڵ㽻��λ��
			adjustHeap(sortArray, 0, j);//��ʣ�µ�Ԫ�ؼ�����������
		}
		return sortArray;
	}
	/**
	 * �����ýڵ�ʹ֮���ϴ���ѣ��ýڵ��ֵ�����Һ��Ӷ���
	 * @param array
	 * @param adjustNodeIndex �������Ľڵ�����
	 * @param length �����ķ�Χ
	 */
	public static void adjustHeap(int[] array,int adjustNodeIndex,int length){
		int maxIndex = adjustNodeIndex;//���Ԫ�ص�������Ĭ��Ϊ��ǰ�����Ľڵ�����
		int leftIndex = 2*adjustNodeIndex+1;//��ǰ�ڵ����������
		int rightIndex = 2*adjustNodeIndex+2;//��ǰ�ڵ���Һ�������
		if(leftIndex<length && array[leftIndex]>array[maxIndex]){//�����ӵ�ֵ�����Ԫ�ش���������Ԫ�ص�����
			maxIndex = leftIndex;
		}
		if(rightIndex<length && array[rightIndex]>array[maxIndex]){//���Һ��ӵ�ֵ�����Ԫ�ش���������Ԫ�ص�����
			maxIndex = rightIndex;
		}
		if(maxIndex!=adjustNodeIndex){//������ڵ㲻�����ֵ���������ڵ�Ϊ���ֵ���ҵ����븸�ڵ㽻���Ľڵ���ϴ����
			swapArrayElement(array, maxIndex, adjustNodeIndex);
			adjustHeap(array, maxIndex, length);
		}
	}
	/**
	 * ��������
	 * ��������ʹ��һ�����������C��Ӧ��Ŵ�����������ÿ��Ԫ�ص�Ƶ�������ֵĴ�������
	 * Ȼ���������C���������������Ԫ���ŵ���ȷ��λ�ã���ֻ�ܶ�������������
	 * @param sortArray
	 * @return
	 */
	public static int[] countingSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		int min = sortArray[0];//����������Сֵ
		int max = sortArray[0];//�����������ֵ
		for(int i=0;i<sortArray.length;i++){//������Сֵ�����ֵ
			if(sortArray[i]<min){
				min = sortArray[i];
			}
			if(sortArray[i]>max){
				max = sortArray[i];
			}
		}
		int[] rateArray = new int[max-min+1];//����Ƶ������,��СΪ�������������ݳ��ֵ����п��������Ҳ���ǣ�max-min+1
		Arrays.fill(rateArray,0);//ȫ�����Ϊ0
		for(int i=0;i<sortArray.length;i++){//�����������飬ͳ��ÿ�����ֳ��ֵĴ���,ÿ��Ԫ����Ƶ�������е����λ��Ϊ��Ԫ��ֵ-��Сֵ
			rateArray[sortArray[i]-min]++;
		}
		int index = 0;
		int index_rate = 0;
		while(index_rate<rateArray.length){//����ȡ�������Ѿ������Ԫ��
			if(rateArray[index_rate]!=0){
				sortArray[index++] = min+index_rate;//ͨ�����λ�ûָ�Ԫ�صı���ֵ
				rateArray[index_rate]--;
			}else{
				index_rate++;
			}
		}
		return sortArray;
	}
	/**
	 * Ͱ����:
	 * Ͱ�����Ǽ�������������档�������˺�����ӳ���ϵ����Ч���Ĺؼ����������ӳ�亯����ȷ����
	 * Ͱ���� �����������ݷ��Ӿ��ȷֲ��������ݷֵ�����������Ͱ�ÿ��Ͱ�ٷֱ�ʹ�ñ�������㷨����
	 * @param sortArray
	 * @param bucketSize
	 * @return
	 */
	public static int[] bucketSort(int[] sortArray,int bucketSize){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		int min = sortArray[0];
		int max = sortArray[0];
		for(int i=0;i<sortArray.length;i++){
			if(sortArray[i]<min){
				min = sortArray[i];
			}
			if(sortArray[i]>max){
				max = sortArray[i];
			}
		}
		int bucketCount = (max-min)/bucketSize+1;//Ͱ�ĸ���
		List<List<Integer>> bucket = new ArrayList<>();//ÿ��Ͱ��һ��List
		for(int i=0;i<bucketCount;i++){//��ʼ��Ͱ
			bucket.add(new ArrayList<Integer>());
		}
		for(int i=0;i<sortArray.length;i++){//�����ݷ���ÿһ��Ͱ��
			List<Integer> temp_bucket = bucket.get((sortArray[i]-min)/bucketSize);
			temp_bucket.add(sortArray[i]);
		}
		int index = 0;
		for(int i=0;i<bucketCount;i++){//��������Ͱ�ֱ��������Ȼ������ƴ������
			List<Integer> temp_bucket = bucket.get(i);
			if(temp_bucket.size()>0){
				int[] temp_bucket_array = new int[temp_bucket.size()];
				for(int j=0;j<temp_bucket_array.length;j++){
					temp_bucket_array[j] = temp_bucket.get(j);
				}
				quickSort(temp_bucket_array, 0, temp_bucket_array.length-1);//ÿ��Ͱ���ÿ�������
				for(int k=0;k<temp_bucket_array.length;k++){
					sortArray[index] = temp_bucket_array[k];
					index++;
				}
			}
		}
		return sortArray;
	}
	/**
	 * ��������
	 * ���������Ƿֱ��ÿһλ������ʮ����...����������
	 * ÿ��������ǰһλ�Ѿ�����Ļ����Ͻ��У����ȴ����λ����λ����ʼ����
	 * @param sortArray
	 * @return
	 */
	public static int[] radixSort(int[] sortArray){
		if(sortArray == null || sortArray.length<2){
			return sortArray;
		}
		int max = sortArray[0];
		for(int i=0;i<sortArray.length;i++){//ȡ�ô��������е����ֵ
			if(sortArray[i]>max){
				max = sortArray[i];
			}
		}
		int maxDigit = 0;//���ֵ��λ��
		while(max!=0){//��ȡ���ֵ��λ��
			max = max/10;
			maxDigit++;
		}
		List<List<Integer>> bucket = new ArrayList<>();
		for(int i=0;i<10;i++){//ÿһλֻ������0-9������ֻ��Ҫ����10��Ͱ
			bucket.add(new ArrayList<Integer>());
		}
		int mod = 10;
		int div = 1;
		for(int i=0;i<maxDigit;i++,mod*=10,div*=10){//�Ӹ�λ��ʼ���ÿһλ�Ĵ�С��������ֱ�����λ
			for(int j=0;j<sortArray.length;j++){
				int bucketIndex = (sortArray[j]%mod)/div;//��ȡ����ӳ���Ͱ��������Ͱ���������������ڵ�ǰ�����λ��ֵ
				bucket.get(bucketIndex).add(sortArray[j]);
			}
			int index = 0;
			for(int m=0;m<bucket.size();m++){//�ռ����ε������������Ͱ��������һ�ε�����
				for(int n=0;n<bucket.get(m).size();n++){
					sortArray[index++] = bucket.get(m).get(n);
				}
				bucket.get(m).clear();
			}
		}
		return sortArray;
	}
	/**
	 * ��������������Ԫ�ص�ֵ
	 * @param array
	 * @param i
	 * @param j
	 */
	public static void swapArrayElement(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	/**
	 * ��ӡ����
	 * @param array
	 */
	public static void PrintArray(int[] array){
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<array.length;i++){
			sb.append(array[i]);
			if(i!=array.length-1){
				sb.append(",");
			}
		}
		sb.append("]");
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		int sortArray[] = new int[]{20,5,3,9,6,7,500,36,1,36,500,20};
		bubbleSort(sortArray);
		//selectionSort(sortArray);
		//insertionSort(sortArray);
		//heerSort(sortArray);
		//sortArray = mergeSort(sortArray);
		//quickSort(sortArray, 0, sortArray.length-1);
		//heapSort(sortArray);
		//countingSort(sortArray);
		//bucketSort(sortArray, 50);
		//radixSort(sortArray);
		PrintArray(sortArray);
	}
}
